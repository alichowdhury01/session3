//______________________________Entete de la table______________________________
const construireEntetes = () => {
    const headerTab = `
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">Picture</th>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
                    <th scope="col">Duration</th>
                    <th scope="col">Tracks Total</th>
                    <th scope="col">Owner</th>
                </tr>
            </thead>
            <tbody>
    `;
    return headerTab;
}

const construireTR = (unePlaylist) => {
    let tr = `<tr>
                <th><img src="${unePlaylist.picture}" alt="image de la playlist"></th>
                <td>${unePlaylist.id}</th>
                <td>${unePlaylist.title}</td>
                <td>${unePlaylist.duration}</td>
                <td>${unePlaylist.nb_tracks}</td>
                <td>${unePlaylist.creator.name}</td>
            </tr>`;
    return tr;
}

//_________________LISTER TOUTES LES PLAYLISTS_____________________
const afficherPlaylist=(liste) => {
    let resultat = construireEntetes();
    for(let unePlaylist of liste){
        resultat += construireTR(unePlaylist);
    }
    resultat += "</tbody></table>";
    document.getElementsByClassName("container")[0].innerHTML = resultat;
}

let demanderName = () => {
    let rep = `
    <form class="row g-3 needs-validation" novalidate>
        <div class="col-md-6">
            <label for="annee" class="form-label">Nom de la playlist recherché</label>
            <input type="text" class="form-control" id="name" name="type" value="" required>
        </div>
        <div class="col-12">
            <button class="btn btn-primary" type="button" onClick="listerParName();">Envoyer</button>
        </div>
    </form>
`;
 document.getElementsByClassName('container')[0].innerHTML = rep;
}
