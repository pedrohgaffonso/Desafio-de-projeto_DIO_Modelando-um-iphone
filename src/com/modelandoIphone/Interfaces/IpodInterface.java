interface IpodInterface {
    void play();
    void pause();
    void selectMusic(String music);
    void connectHeadphones();
    void rateAlbum(Album album, int stars);
    void addAlbum(Album album);
    void selectAlbum(Album album);
    void removeAlbum(Album album);
    void watchVideo();
    void pauseVideo();
    void selectVideo(Video video);
}