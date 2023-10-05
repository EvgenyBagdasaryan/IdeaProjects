package org.example.adapter;

// Реализация интерфейса AdvancedMediaPlayer для формата VLC
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Пустая реализация, т.к. VLC не поддерживает формат mp4
    }
}
