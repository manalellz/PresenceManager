# 📱 PrésenceManager — TP03 : Gestion des Événements

![Android](https://img.shields.io/badge/Android-Kotlin-brightgreen.svg?style=flat&logo=android)
![Platform](https://img.shields.io/badge/Platform-Android%20Studio-blue.svg)
![Version](https://img.shields.io/badge/Version-1.0-orange.svg)

Application Android développée dans le cadre du module **M203 — Développement d'applications mobiles** (Filière Développement Digital — Option Applications Mobiles).




## 📝 1. Description du projet
**PrésenceManager** est une application Android native permettant aux formateurs de gérer la présence des stagiaires. 

Cette version (**TP03**) intègre la programmation dynamique des interactions utilisateur en Kotlin :
- **Navigation inter-activités** sécurisée par des `Intent` explicites.
- **Messages d'aide contextuels** via des appuis longs (`Toast`).
- **Détection de gestes complexes** : double-clic via `GestureDetector` pour afficher la boîte *"À propos"*.
- **Fenêtre d'information développeur** avec lien web cliquable (`Linkify.WEB_URLS`).

---

## 📚 2. Définitions et Concepts d'Événements

### Qu'est-ce qu'un événement utilisateur ?
Un **événement utilisateur** représente toute interaction physique ou tactile effectuée par l'utilisateur sur l'interface graphique (ex. toucher un bouton, maintenir la pression sur une carte, effectuer un tapotement rapide).

### Rôle d’un Event Listener (Écouteur d'événements)
Un **Event Listener** est une interface qui "écoute" en arrière-plan les interactions sur un composant visuel (`View`) et exécute un bloc de code Kotlin spécifique lorsque cet événement se produit.

### Différences entre les gestes :
1. **Clic simple (`OnClickListener` / `onClick`)** : Déclenché lors d'un tapotement unique et rapide. Utilisé principalement pour la navigation et l'exécution d'actions principales.
2. **Appui maintenu (`OnLongClickListener` / `onLongClick`)** : Déclenché lorsque l'utilisateur maintient la pression sur un composant. Il renvoie un booléen (`true` si l'événement est consommé).
3. **Double-clic (`GestureDetector` / `onDoubleTap`)** : Déclenché lors de deux tapotements rapprochés sur une vue. Géré à l'aide de `GestureDetector` combiné avec `OnTouchListener`.

---

## ⚡ 3. Table des Événements et Interactions Implémentés

| Composant | Vue ID | Événement / Geste | Action Réalisée |
| :--- | :--- | :--- | :--- |
| **Bouton Commencer** | `btnCommencer` | Clic simple (`setOnClickListener`) | Ouvre le tableau de bord (`DashboardActivity`). |
| **Carte Groupes** | `cardGroupes` | Clic simple (`setOnClickListener`) | Navigation vers `GroupesActivity`. |
| **Carte Groupes** | `cardGroupes` | Appui long (`setOnLongClickListener`) | Affiche Toast : *"Groupes : sélectionner ou consulter les groupes"*. |
| **Carte Faire l'appel** | `cardAppel` | Clic simple (`setOnClickListener`) | Navigation vers `AppelActivity`. |
| **Carte Faire l'appel** | `cardAppel` | Appui long (`setOnLongClickListener`) | Affiche Toast : *"Faire l'appel : démarrer une séance"*. |
| **Carte Historique** | `cardHistorique` | Clic simple (`setOnClickListener`) | Navigation vers `HistoriqueActivity`. |
| **Carte Statistiques** | `cardStatistiques` | Clic simple (`setOnClickListener`) | Navigation vers `StatistiquesActivity`. |
| **Icône du profil** | `imgProfil` | Double-clic (`onDoubleTap`) | Affiche un `AlertDialog` *"À propos de PrésenceManager"*. |
| **Texte de version** | `txtFooter` / `txtFooterDashboard` | Clic simple (`setOnClickListener`) | Affiche un `AlertDialog` *"Informations du développeur"* avec lien GitHub cliquable. |

---

## 🛠️ 4. Architecture et Structure du Code

```text
com.example.presencemanager/
├── MainActivity.kt            # Écran d'accueil et lancement
├── DashboardActivity.kt       # Tableau de bord principal & gestion des gestes
├── GroupesActivity.kt         # Écran de gestion des groupes
├── AppelActivity.kt           # Écran de prise de présence
├── HistoriqueActivity.kt      # Historique des séances
└── StatistiquesActivity.kt    # Statistiques de présence
```

---

## 👤 5. Informations du Développeur

- **Développeur** : Manal ELLOUZI
- **Application** : PrésenceManager (Version 1.0)
- **Dépôt GitHub** : [https://github.com/manalellz/PresenceManager](https://github.com/manalellz/PresenceManager)
