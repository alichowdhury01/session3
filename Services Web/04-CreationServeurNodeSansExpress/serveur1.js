const http = require("http");

const hote = "localhost";
const port = 8000;

// req : request  res : response
const ecouteurRequetes = (req, res) => {};

const serveur = http.createServer(ecouteurRequetes);
serveur.listen(port, hote, () => {
  console.log(`Serveur demarrĂ© sur http://${hote}:${port}`);
});
