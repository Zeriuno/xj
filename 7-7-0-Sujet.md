# Exercice

Le but de votre programme est de gérer une bibliothèque.
(Ci-joint une classe Adherent et une interface Empruntable, dont je parle plus bas et sur lesquelles vous pourrez vous appuyer.)

Vous devez réaliser un ensemble de classe qui propose des fonctionnalités pour gérer le fonctionnement de la bibliothèque. Vous ne réaliserez pas d'interface utilisateur, mais des classes fournissant des méthodes... (comme Zoo)

La bibliothèque a une liste d'inscrits (les adhérents), pour chacun, on a le nom, le prénom, ainsi que la liste des emprunts en cours, au nombre de 5 au maximum.
La bibliothèque a aussi une liste de ce qu'elle propose à ses adhérents : du matériel et aussi des documents.

En ce qui concerne le matériel, il s'agit ordinateurs portables ou vidéo-projecteurs. Chacun est identifié par un numéro unique généré lorsqu'on le crée dans le système, ainsi que par une chaine de caractère qui sert de dénomination au matériel (par exemple "Vidéo-projecteur Sharp 3453") et qui est fournie lorsqu'on enregistre le matériel.
En ce qui concerne les documents, il y a des revues et des volumes. Les revues sont caractérisées par un titre (un String) et un numéro (un int). Et les volumes sont caractérisés par un numéro ISBN (un int). En réalité les volumes sont soit des livres, soit des bandes dessinées. Les livres sont caractérisés par un titre et un auteur, les bandes dessinées par un titre et un dessinateur (ce sont des String). Toutes les informations concernant un document doivent être fourniespour créer un objet dans le système.

Enfin les vidéo-projecteurs ainsi que les volumes sont empruntables (pas les revues ni les ordinateurs portables). Vous capturerez cette possibilité par l'utilisation de l'interface Empruntable fournie, et qui apparaît déjà dans la classe Adhérent ci-jointe.

À propos de la classe Adherent, notez que l'attribut emprunts est un ArrayList contenant les objets empruntés par l'utilisateur et qui peut être modifié par différentes méthodes.
Vous n'avez pas besoin de modifier cette classe, ni l'interface Empruntable pour l'utiliser dans votre programme.

J'impose qu'il existe une classe Bibliotheque qui fournisse les fonctionnalités suivantes :
- 3 méthodes d'ajout à la bibliothèque, d'un document, d'un adhérent, ou de matériel,
- une méthode boolean emprunt(Adherent a, Empruntable e) qui permet de signaler le fait qu'un adhérent emprunte quelque chose. Cette méthode ne change rien et retourne false si l'adhérent a atteint le nombre maximal d'emprunt, ou bien si l'objet est déjà emprunté. Elle retourne true et ajoute l'objet à la liste des objets empruntés de l'adhérent sinon.
- une méthode boolean rendu( Empruntable e) qui retourne false si l'objet n'était pas emprunté et true sinon et qui met à jour les informations dans l'objet et dans l'adhérent qui l'avait emprunté,
- une méthode qui renvoie une chaine de caractère qui liste les documents de la bibliothèque,
- une méthode qui liste les documents non empruntables,
- une méthode qui renvoie une chaine de caractère qui liste les documents empruntés.
- une méthode qui renvoie une chaine de caractère qui liste les documents empruntés, avec l'emprunteur.
