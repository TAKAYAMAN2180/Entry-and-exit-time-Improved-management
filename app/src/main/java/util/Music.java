package util;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.InputStream;

public class Music {

    public static void Play(InputStream mp3file) throws JavaLayerException {

        AudioDevice device = FactoryRegistry.systemRegistry().createAudioDevice();
        // create an MP3 player
        AdvancedPlayer player = new AdvancedPlayer(mp3file, device);

        player.play();
    }
}