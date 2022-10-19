//Algorithmes de recherche
//Cas particuliers avec JavaScript
// let a='?';
// if(isNaN(a)){//Teste si a n'est pas un nombre
//     console.log("SVP tapez un nombre");
// } else
//     if(a == undefined){//Teste si a n'a pas été initialisée
//         console.log("Initialiser a");
//     }else {//Alors on fait les calculs
//         a=a+2;
//         console.log(a);
//     }

// try {
//     //Façon non classique de tester si nous sommes rendus à la fin du tableau
//     while( tab[i] != undefined){
//         ++i;
//         //console.log(i);
//     }
    
// }catch (e) {
//     console.log("Une erreur");
// }
// if(i == taille){
//     console.log("Introuvable");
// } else {
//     console.log("Element trouve a la position : "+i);
// }

//Algo 1 : Recherche séquentielle
let tab = [2,1,7,18,5,12];

let i=0;
let elem = 18;
let taille = tab.length;

//Mettre toujours le test de sortie du tableau en premier (i < taille)
//et l'accès au tableau en deuxième condition.
while (i < taille && tab[i] != elem){
    ++i;
}
if(i == taille){
    console.log("L'élément "+elem+" n'est pas dans le tableau.")
} else {
    console.log("L'élément "+elem+" a été trouvé à la position "+i+" du tableau.")
}

//Analyse de l'efficacité (le temps) de notre algo.
//Ici on s'intéresse au pire cas où l'élément n'est pas présent.
// while (i < taille && tab[i] != elem){//La condition est l'instruction baromètre
//     ++i;
// }

//Analyse
//Instruction barométre i < taille && tab[i] != elem
//Nombre de fois exécutée si l'élément n'est pas présent (le pire cas)
//6 soit la taille du tableau
//Si le tableau avait une taille de N éléments alors 
//en notation par « big o » O(N) qu'est le pire cas
//pour notre algorithme. On dit que notre algorithme est 
//en ordre de N. Ceci vaut dire que notre algorithme dans le pire
//cas a éxécuté l'instruction barométre N fois.




