// Importation des modules nécessaires au fichier serveur.ts
import express from "express";
import { NextFunction, Request, Response } from "express";
import bodyParser = require("body-parser");
import http from "http";
import path from "path";

// Création d'un serveur Node dont les requêtes entrantes
// et sortantes sont gérées par express.

const exp = express();
const serveur = http.createServer(exp);
const porte = 8181;
serveur.listen(porte);// Famille des 8080-8888
console.log(`\nServeur démarré sur le port ${porte}`); // Affichage dans la console du port utilisé par le serveur Node pour écouter les requêtes entrantes du client. 

// Pour obtenir les ressources statiques css, js, images, ...
// qui partiront avec vos pages web via les balises link, script, <img src=
exp.use(express.static(__dirname + "/app/src"));  // __dirname est le répertoire courant du fichier serveur.ts (ici app) 
// Support json encoded bodies
exp.use(bodyParser.json());
// Support text encoded bodies 
exp.use(bodyParser.text()); 
// Support text encoded bodies
exp.use(express.urlencoded({ extended: true })); 

//Traiter les requêtes provenant du client et les réponses à retourner au client
exp.get("/films", async (req: Request, res: Response) => { // Requête GET sur la ressource films  
  if (req.body.action === "fichier films") { // Si le client demande le fichier films.json
    console.log("Données bien reçues");
  }
  res.sendFile(path.join(__dirname + "/app/src/serveur/donnees/films.json")); // Envoi du fichier films.json au client 
});
