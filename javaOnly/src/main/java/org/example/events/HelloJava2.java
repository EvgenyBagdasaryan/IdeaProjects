package org.example.events;

import javax.swing.*;

public class HelloJava2 {
    public HelloJava2() {
        JFrame frame = new JFrame( "HelloJava2" );
        frame.add( new HelloComponent2( "Hello, Java!" ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}
