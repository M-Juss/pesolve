# Pesolve

A mobile-based personal finance tracker built with Android Studio, focused on helping users monitor transactions and understand their financial habits through analytics.

## Overview

**Pesolve** is an Android application designed to track income and expenses while providing users with a clear view of their transaction history and financial trends. Similar in concept to **budgy**, this project explores how personal finance management can be implemented in a native mobile environment.

The app emphasizes simplicity, accessibility, and offline functionality by leveraging a local database for storing and managing data.

## Features

* 📥 Record income transactions
* 📤 Track daily expenses
* 📜 View complete transaction history
* 📊 Visualize financial data through analytics
* 📅 Monitor spending patterns over time
* 📱 Fully functional as a native Android app

## Tech Stack

### Frontend

* XML (Android layouts)

Used to design the user interface with a structured and native Android approach.

### Backend

* Java (Application logic)
* SQLite (Local database)

Handles data processing, storage, and retrieval directly on the device, allowing offline access and fast performance.

## Tools & Libraries

* MPAndroidChart

  * Used for generating charts and visual analytics
  * GitHub: https://github.com/PhilJay/MPAndroidChart

* DB Browser for SQLite (SimpleSQLiteBrowser)

  * Used to inspect and manage the SQLite database during development

## How It Works

Users input their income and expenses directly into the app. These transactions are stored locally using SQLite. The app then processes this data to display transaction history and generate charts that help users understand their financial behavior.

Because everything is stored locally, the app remains fast, lightweight, and usable without an internet connection.

## Purpose

This project was built to:

* Practice native Android development using Java and XML
* Understand local database management with SQLite
* Explore mobile-based data visualization
* Reinforce concepts of financial tracking systems

## Future Improvements

* Add categories for transactions
* Implement search and filtering for history
* Introduce budget limits and alerts
* Improve UI/UX for better usability
* Add cloud sync or backup functionality


