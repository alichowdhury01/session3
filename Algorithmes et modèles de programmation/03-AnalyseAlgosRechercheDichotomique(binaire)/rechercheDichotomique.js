//Algorithmes de recherche

//CAS : Recherche dichotomique

let tab = [6, 33, 1, 17, 12, 8, 40, 50, 3, 2, 9, 65, 99, 7];


// Inline compare function
tab.sort((a, b) => a-b);
//{ 
    // if(a > b)
    //    return 1;
    // else if (a < b)
    //         return -1;
    //      else 
    //         return 0;
//});

//let tabD = tab.sort().reverse();
//console.log(tab);
let tourBoucle=0;
let rechercheDichotomique = (tabC, elem) => {
    let inf = 0, sup = tabC.length-1, pivot;
    while (inf <= sup) {
        ++tourBoucle;
        pivot = Math.floor((inf+sup)/2);
        if ( elem === tabC[pivot] ) {
            return pivot;
        } else if (elem > tabC[pivot]){
            inf = pivot + 1;
        } else {
            sup = pivot - 1;
        }
    }
    return -1;
}
let elem = 40;
let pos = rechercheDichotomique(tab, elem);

if(pos != -1){
    console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`);
}else {
    console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`);
}

//Analyse
//Instruction barométre i < taille && tab[i] != elem
//Nombre de fois exécutée si l'élément n'est pas présent (le pire cas)
//6 soit la taille du tableau
//Si le tableau avait une taille de N éléments alors 
//en notation par « big o » O(N) qu'est le pire cas
//pour notre algorithme. On dit que notre algorithme est 
//en ordre de N. Ceci vaut dire que notre algorithme dans le pire
//cas a éxécuté l'instruction barométre N fois.




