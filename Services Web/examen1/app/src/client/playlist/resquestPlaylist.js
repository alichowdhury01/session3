const chargerPlaylistJSON = () => {
    $.ajax({
        url: "/playlist",
        type: "GET",
        data: {},
        dataType: "json",
        async: true,
        success: (reponse) => {
            listePlaylist = reponse;
        },
        fail: (err) => {
            alert(`Grosse erreur: ${err.message}`);
        }
    });
}

let listerParName = () => {
    let type = document.getElementById('name').value;

    $.ajax({
        url:"/namePlaylist",
        type:"POST",
        data:{'nameRecherche': type},
        dataType:'json',  // json, xml, text
        async: true, // false pour se  mettre en mode synchrone.
        success: (listePlaylistName) => {
            afficherPlaylist(listePlaylistName);
        },
        fail: (e) => {
            alert(`Gros probléme : ${e.message}`);
        }
    });
}
