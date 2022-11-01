export class Playlist {
    picture: string;
    id: number;
    title: string;
    duration: number;
    nbTracks: number;
    creator: object;
    name: string;

    constructor(picture: string, id: number, title: string, duration: number, nbTracks: number, creator: object, name: string) {
        this.picture = picture;
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.nbTracks = nbTracks;
        this.creator = creator;
        this.name = name;
    }

}