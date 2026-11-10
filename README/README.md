# PrésenceManager — TP03 : Gestion des Événements

Application Android permettant de gérer la présence des stagiaires, développée dans le cadre du module **M203 — Développement d'applications mobiles**.

---

## 1. Description du projet
**PrésenceManager** est une application Android permettant aux formateurs de gérer la présence des stagiaires.
Cette version (TP03) intègre la programmation des interactions utilisateur en Kotlin :
- Navigation entre les activités.
- Messages d'aide contextuels via des appuis longs (Toasts).
- Boîte de dialogue "À propos" via un geste de double-clic.
- Boîte de dialogue "Informations du développeur" avec un lien GitHub cliquable.

---

## 2. Définitions et Concepts d'Événements

### Qu'est-ce qu'un événement utilisateur ?
Un **événement utilisateur** représente toute interaction effectuée par l'utilisateur sur l'interface graphique de l'application (par exemple : toucher un bouton, maintenir la pression sur une carte, effectuer un geste).

### Rôle d’un Event Listener (Écouteur d'événements)
Un **Event Listener** est une interface qui "écoute" les actions sur un composant visuel (`View`) et exécute un bloc de code Kotlin spécifique en réponse lorsque cet événement se produit.

### Différences entre les gestes :
1. **Clic simple (`OnClickListener` / `onClick`)** : Déclenché lors d'un tapotement unique et rapide. Utilisé principalement pour la navigation et l'activation d'actions immédiates.
2. **Appui maintenu (`OnLongClickListener` / `onLongClick`)** : Déclenché lorsque l'utilisateur maintient la pression sur un composant. Il renvoie `true` pour indiquer que l'événement a été consommé.
3. **Double-clic (`GestureDetector` / `onDoubleTap`)** : Déclenché lors de deux tapotements rapprochés sur une vue. En Android, il est géré via `GestureDetector` combiné avec `OnTouchListener`.

---

## 3. Événements et Interactions Implémentés

| Composant | Geste / Événement | Action Réalisée |
| :--- | :--- | :--- |
| **Bouton `btnCommencer`** (Accueil) | Clic simple (`setOnClickListener`) | Ouvre le tableau de bord (`DashboardActivity`). |
| **Carte `cardGroupes`** (Dashboard) | Clic simple (`setOnClickListener`) | Ouvre la page `GroupesActivity`. |
| **Carte `cardGroupes`** (Dashboard) | Appui long (`setOnLongClickListener`) | Affiche un Toast : *"Groupes : sélectionner ou consulter les groupes"*. |
| **Carte `cardAppel`** (Dashboard) | Clic simple (`setOnClickListener`) | Ouvre la page `AppelActivity`. |
| **Carte `cardAppel`** (Dashboard) | Appui long (`setOnLongClickListener`) | Affiche un Toast : *"Faire l'appel : démarrer une séance"*. |
| **Carte `cardHistorique`** (Dashboard) | Clic simple (`setOnClickListener`) | Ouvre la page `HistoriqueActivity`. |
| **Carte `cardStatistiques`** (Dashboard) | Clic simple (`setOnClickListener`) | Ouvre la page `StatistiquesActivity`. |
| **Icône `imgProfil`** (Header) | Double-clic (`onDoubleTap`) | Affiche un `AlertDialog` *"À propos de PrésenceManager"*. |
| **Texte `Version 1.0`** (Pied de page) | Clic simple (`setOnClickListener`) | Affiche un `AlertDialog` *"Informations du développeur"* avec lien GitHub cliquable. |

---

## 4. Informations du Développeur
- **Développeur** : Mohamed EL HAIRCHE
- **Application** : PrésenceManager (Version 1.0)
- **Dépôt GitHub** : [https://github.com/Mohamed22-Dev/PresenceManager](https://github.com/Mohamed22-Dev/PresenceManager)
