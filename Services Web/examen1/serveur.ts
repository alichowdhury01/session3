import express from "express";
import { NextFunction, Request, Response } from "express";
import bodyParser = require("body-parser");
import http from "http";
import path from "path";

import { listePlaylistName } from "./app/src/serveur/controleur/controleurPlaylist";

const app = express();
const server = http.createServer(app);
const port = 3001;
server.listen(port, () => {
    console.log("Server listening at port %d", port);
});


app.use(express.static(path.join(__dirname, "/app/src")));

app.use(bodyParser.json());

app.use(bodyParser.text());

app.use(express.urlencoded({extended: true}));

app.get("/", (req: Request, res: Response) => {
    res.sendFile(path.join(__dirname, "/app/src/index.html"));
});

app.get("/playlist", async (req: Request, res: Response, next: NextFunction) => {
    res.sendFile(path.join(__dirname, "app/src/serveur/data/myPlaylist.json"));
});

app.post("/namePlaylist", async (req: Request, res: Response) => {
    let listeNamePlaylist = await listePlaylistName(req);
    res.send(listeNamePlaylist);
});