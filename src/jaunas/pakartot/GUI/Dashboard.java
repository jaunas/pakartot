package jaunas.pakartot.GUI;

import javax.swing.*;

public class Dashboard {
    private JPanel panel;
    private MediaGrid newestAlbums;
    private MediaGrid recentlyAddedAlbums;
    private MediaGrid mostLikedAlbums;
    private MediaGrid genres;

    public JPanel getPanel() {
        return panel;
    }

    public Dashboard() {
        newestAlbums.setTitle("Naujausi albumai");
        recentlyAddedAlbums.setTitle("Naujausia ikelta muzika");
        mostLikedAlbums.setTitle("Mylimi");
        genres.setTitle("Stiliai");
    }
}
