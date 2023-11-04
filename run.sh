#!/bin/bash
javac inf3312/concepts/Voiture.java && 
javac inf3312/concepts/TestVoiture.java && java inf3312/concepts/TestVoiture

echo "\n\n"
echo "Running Application 1 & 2 \n\n"
echo "=======================================================\n\n"

javac inf3312/concepts/Point.java && 
javac inf3312/concepts/Pointcol.java && 
javac inf3312/concepts/TestPoint.java && java inf3312/concepts/TestPoint
echo "=======================================================\n\n"

javac inf3312/concepts/Affichable.java &&
javac inf3312/concepts/Entier.java && 
javac inf3312/concepts/Flottant.java &&
javac inf3312/concepts/TestAffichable.java &&
java inf3312/concepts/TestAffichable
echo "=======================================================\n\n"

javac inf3312/concepts/Compte.java &&
javac inf3312/concepts/CompteEpargne.java && 
javac inf3312/concepts/CompteSecurise.java &&
javac inf3312/concepts/TestCompte.java &&
java inf3312/concepts/TestCompte
