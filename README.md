# FXMailer
Desktop application Tool. Allow you to send a beautiful html template to multiple email recipients with one click!

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)
![java 8 badge](https://img.shields.io/badge/Java-8-red.svg)
![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)

## Features
* [x] Easy to use
* [x] Send HTML template with images
* [x] Send Email to multiple receivers
* [x] Can Inject the name of receiver in template using this tag: \<name\>
* [x] Parse JSON data (email + name of each recipient)
* [x] Support Markdown syntax (We convert Markdown to HTML template)

# Thank _You_!
Please :star: this repo and share it with others

## Screenshoots
Main App               |
|:---------------------:|
![screenshoot](screenshots/fxmailer_main.png) |
Sending Status |
![screenshot](screenshots/fxmailer_status.png) |
Template (result)           |
![screenshot](screenshots/template_sample.png) |

## Requirements
* Java version 8 (JDK 8)
* Maven
* Internet connection
* Sender Email must be Gmail
* Allowing less secure apps to access your account ([Learn more](https://support.google.com/accounts/answer/6010255?hl=en))

## Libraries used
* JFoenix (Material design)
* FlexMark (Markdown Parser)
* Gson (JSON parser)
* Java Mail

## Technologies used
* JavaFX

## Installation
1. Download the repository files (project) from the download section or clone this project by typing in the bash the following command:

       git clone https://github.com/HouariZegai/FXMailer.git
2. Import it in Intellij IDEA or any other Java IDE and let Maven download the libraries used for you.
3. Run the application :D

## Recipients JSON format (Sample)

       [
         {
           "name": "Houari Zegai",
           "email": "admin@houarizegai.net"
         },
         {
           "name": "Mohamed Ali",
           "email": "mohamed@houarizegai.net"
         }
       ]

## Contributing 💡
If you want to contribute to this project and make it better with new ideas, your pull request is very welcomed.
If you find any issue just put it in the repository issue section, thank you.

## Contact me
Email: houarizegai14@gmail.com  
LinkedIn: [HouariZegai](https://linkedin.com/in/houarizegai)  
Twitter: [@HouariZegai](https://twitter.com/houarizegai)
