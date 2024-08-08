interface CellPhoneInterface {
    void call(String number);
    void addCallConference(String number);
    void answerCall();
    void startVoiceEmail(VoiceEmail audio);
    void sendVoiceEmail(VoiceEmail audio);
    void deleteVoiceEmail(VoiceEmail audio);
    void selectVoiceEmail(VoiceEmail audio);
    void selectRecentCalls();
    void selectRecentMissedCalls();
    void addContact(String number);
    void favoriteContact(String number);
    void unfavoriteContact(String number);
    void sendSMS(String text);
    void deleteSMS();
    void takePicture();
    void openGallery();
    void selectPhoto(Photo photo);
    void openCalendar();
    void addEventToCalendar(String text);
}