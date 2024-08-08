# Desafio de Projeto [DIO](https://www.dio.me/)
## Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet
##  [BootCamp da GFT - Desenvolvimento Java com IA](https://web.dio.me/track/coding-future-gft-desenvolvimento-java-com-ia)

## Modelando o iPhone com UML

```mermaid
classDiagram
    Iphone <|-- Ipod
    Iphone <|-- Internet
    Iphone <|-- CellPhone

    Iphone: +synchronizeInformation()
    Iphone: +password()
    Iphone: +unlockHomeScreen()
    Iphone: +home()
 

    class Ipod{
      +User user
      +play()
      +pause()
      +selectMusic(Music String)
      +connectHeadphones()
      +rateAlbum(Album album, Number stars) 
      +addAlbum(Album album)
      +selectAlbum(Album album)
      +removeAlbum(Album album)
      +watchVideo()
      +pauseVideo()
      +selectVideo(Video video)
    }
    class Internet{
      +displayPage(String url) 
      +addNewTab()
      +updatePage()
      +closePage(String url)
      +openGoogleMaps()
      +openSafari()
      +sendEmail(Email email)
      +editEmail(Email email)
      +selectEmail(Email email)
    }
    class CellPhone{
      +String cellPhoneNumber
      +call(String number)
      +addCallConference(String number)
      +answerCall()
      +startVoiceEmail(VoiceEmail audio)
      +sendVoiceEmail(VoiceEmail audio)
      +deleteVoiceEmail(VoiceEmail audio)
      +selectVoiceEmail(VoiceEmail audio)
      +selectRecentCalls()
      +selectRecentMissedCalls()
      +addContact(String number)
      +favoriteContact(String number)
      +unfavoriteContact(String number)
      +sendSMS(String Text)
      +deleteSMS()
      +takePicture()
      +openGallery()
      +selectPhoto(Photo photo)
      +openCalender()
      +addEventToCalender(String text)
    }
```
