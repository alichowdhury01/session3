const chargerFilmsJSON = () => { alert(1); // fonction qui charge les films en JSON depuis le serveur et les affiche dans la page HTML 
    $.ajax({ // Requête AJAX avec jQuery (voir https://api.jquery.com/jquery.ajax/) 
        url:"/films", // URL de la requête AJAX (ici, la route /films) 
        type:"GET", // GET par défaut mais on le précise quand même pour la lisibilité du code 
        data: {"action":"fichier films"}, // on envoie la valeur de l'action à la route /films (voir app.js) 
        dataType:"text", //3 types de données possibles: text, html, json (par défaut) 
        async: true, //true par défaut (asynchrone) ou false (synchrone) 
        success: (listerFilms) => { //callback en cas de succès de la requête ajax (200) 
            alert(listerFilms); //affiche le résultat de la requête dans une boîte de dialogue (alert) 
        },
        fail: (err) => { //callback en cas d'échec de la requête ajax (erreur 404, 500, etc.) 
            alert(`Gros problème: ${err.message}`); //affiche le message d'erreur de la requête si elle échoue (erreur 404, 500, etc.) 
        } 
    }); 
    console.log("Requêtes envoyées au serveur"); //affiche dans la console du navigateur 
};