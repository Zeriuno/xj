1
---

Compte:
  * numéro de compte (unique)
  * nom du titulaire
  * solde du compte
  * découvert actuel
  * découvert maximal
  * débit maximal

Méthodes publiques

* création de compte.<br>
  Par défaut le découvert maximal est à 800€ et le débit maximal 1000€.
  `Compte nouveauCompte(String nomTitulaire)`<br />
    Le solde sera 0.<br />
  `Compte nouveauCompte(String nomTitulaire, depotInitial)`<br />
  Par défaut le découvert maximal est à 800€ et le débit maximal 1000€.
* révision du découvert maximal<br>
  `void decouvMax(float montant)`<br>
  La valeur par défaut de découvert maximal est remplacée avec celle passée en argument.
* révision du débit maximal<br>
  `void debitMax(float montant)`<br>
  La valeur par défaut de débit maximal est remplacée avec celle passée en argument.
* créditer un compte est égal à le débiter.<br>
  `boolean mouvmtCompte(float montant)`<br>
  `true`: opération effectuée.<br>
  `false`: opération impossible.<br>
  Si le montant est négatif, un test est fait avant d'exécuter l'opération, pour vérifier si le solde final respecte le découvert maximal. Si non, `false` est retourné. Ce test peut être déporté dans une méthode `private` (car il sert également à la méthode virement).<br>
  Si oui, l'opération est exécutée, le solde est mis à jour, le découvert actuel également.

* virement<br>
  `boolean virmt(float montant, int rib)`<br>
  `true`: opération effectuée.<br>
  `false`: opération impossible.<br>
  Le montant est soustrait au compte par le bais de la fonction de mouvement de compte.
* consulter : num, tit, soldeCompte, montantdécMax, montantdebMax.<br>
  Ce sont de simples getters, tous sans arguments, chacun renvoie le type qui lui correspond.
