package com.example.newprojecutui;

public class Songcollection {

    private Songscode song[] = new Songscode[3];

    public Songcollection(){

        Songscode first_song=new Songscode("S1001",
                "come to light",
                "Jeff Williams",
                "https://p.scdn.co/mp3-preview/a2f1808b814516d0778d1bf41bcd542fa6379135?cid=2afe87a64b0042dabf51f37318616965",
                0.30,
                R.drawable.billie_jean_daniela);
        Songscode Second_song =new Songscode("S1002",
                "Top japanese version",
                "Stray kids",
                "https://p.scdn.co/mp3-preview/d570f1ee586944205307317d5a6d330e221637dd?cid=2afe87a64b0042dabf51f37318616965",
                3.13,
                R.drawable.home);
        song[0]=first_song;
        song[1]=Second_song;

    }
    public int Search_Song_By_Id(String id) {

        for(int index=0; index < song.length; index++){
            Songscode tempSongs = song[index];
            if (tempSongs.getId().equals(id)) {
                return index;
            }
        }
        return  -1;
    }
}
