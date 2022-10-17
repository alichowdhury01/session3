"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
exports.__esModule = true;
// Importation des modules nécessaires au fichier serveur.ts
var express_1 = require("express");
var bodyParser = require("body-parser");
var http_1 = require("http");
var path_1 = require("path");
var controleurFilm_1 = require("./app/src/serveur/film/controleurFilm");
// Création d'un serveur Node dont les requêtes entrantes
// et sortantes sont gérées par express.
var exp = (0, express_1["default"])();
var serveur = http_1["default"].createServer(exp);
var porte = 8282;
serveur.listen(porte); // Famille des 8080-8888
console.log("\nServeur d\u00E9marr\u00E9 sur le port ".concat(porte));
// Pour obtenir les ressources statiques css, js, images, ...
// qui partiront avec vos pages web via les balises link, script, <img src=
exp.use(express_1["default"].static(__dirname + "/app/src"));
// Support json encoded bodies
exp.use(bodyParser.json());
// Support text encoded bodies
exp.use(bodyParser.text());
// Support text encoded bodies
exp.use(express_1["default"].urlencoded({ extended: true }));
//Traiter les requêtes provenant du client et les réponses à retourner au client
exp.get("/", function (req, res) { return __awaiter(void 0, void 0, void 0, function () {
    return __generator(this, function (_a) {
        res.sendFile(path_1["default"].join(__dirname + "/app/src/index.html"));
        return [2 /*return*/];
    });
}); });
exp.all("/films", function (req, res) { return __awaiter(void 0, void 0, void 0, function () {
    var reponse, liste;
    return __generator(this, function (_a) {
        switch (_a.label) {
            case 0: return [4 /*yield*/, (0, controleurFilm_1.controleurFilms)(req)];
            case 1:
                reponse = _a.sent();
                if (req.body.action === "fichier") {
                    res.sendFile(reponse);
                }
                else {
                    liste = [
                        { id: 1, nom: "Bibi" },
                        { id: 2, nom: "Baba" },
                        { id: 3, nom: "Bobo" }
                    ];
                    res.send(JSON.stringify(liste));
                }
                return [2 /*return*/];
        }
    });
}); });
exp.all("/membres", function (req, res) { return __awaiter(void 0, void 0, void 0, function () {
    return __generator(this, function (_a) {
        res.send("En cours de développement!");
        return [2 /*return*/];
    });
}); });
