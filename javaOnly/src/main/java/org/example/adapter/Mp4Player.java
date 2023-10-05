package org.example.adapter;

// Реализация интерфейса AdvancedMediaPlayer для формата MP4
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Пустая реализация, т.к. MP4 не поддерживает формат vlc
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}