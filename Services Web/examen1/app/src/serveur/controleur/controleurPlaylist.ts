import {Request, Response} from 'express';
import path from 'path';
import { open } from 'node:fs/promises';
import { Playlist } from './Playlist';

const chargerFichierJsonEnObjectJson =async (): Promise<Array<Playlist>> =>  {
    let cheminFichier = path.join(__dirname, "../data/myPlaylist.json");
    let listePlaylist: Array<Playlist> = [];
    try {
        let fichier = await open(cheminFichier);
        const contenu = await fichier.readFile("utf-8");
        fichier.close();
        listePlaylist = JSON.parse(contenu);
    } catch (error: any) {
        console.log(error);
    } finally {
        return listePlaylist;
    }
}

export const listePlaylistName = async (req: Request): Promise<string> => {
    let listePlaylist: Array<Playlist> = await chargerFichierJsonEnObjectJson();
    let nameCherche = req.body.nameRecherche;
  
    let listePlaylistName: Array<Playlist> = [];
    //there's an object in the array named creator and inside it there's a name property that we want to compare to the nameCherche
    
    for (let unePlaylist of listePlaylist) {
      if (unePlaylist.name === nameCherche) {
        listePlaylistName.push(unePlaylist);
      }
    }
    return JSON.stringify(listePlaylistName);
  };