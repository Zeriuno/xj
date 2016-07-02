L'objectif du TP est de gérer des dominos et une suite de domino.

Un domino est constitué de deux chiffres compris entre 0 et 6 inclus représentés par x et y ou alors d'aucun chiffre.

Par exemple [4,5] représente le domino qui contient 4 à un bord et 5 à l'autre.

Pour nous ici, un domino a un sens (une extrémité gauche et une extrémité droite) mais une méthode inverse permet d'inverser les deux extrémités du domino. Par exemple de passer de [4,5] à [5,4].


Un domino a aussi une méthode qui prend un autre objet domino et retourne true si et seulement si on peut le mettre au bout de l'autre.


Cas particulier les dominos jokers peuvent être posés n 'importe où.


Une suite de domino est un ArrayList de dominos tels que à chaque fois qu'un domino A précède un domino B, l'extrémité droite de B à la même valeur que A.

exemple : [2,4] [4,5] [5,0] [0,2] [2,2] [2,4] [4,1] est une suite valide.

[2,4] [3,2] n'est pas une suite.


La classe SuiteDomino doit fournir des méthodes d'ajout, de test de possibilité d'ajout, au début, à al fin et éventuellmeent en retournant les dominos.
