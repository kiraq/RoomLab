package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class MonsterRoom extends Room{

    public MonsterRoom(int x, int y){
        super(x,y);
    }

    public void enterRoom(Person x) {

        occupant = x;
        String monster = "                                              ____\n" +
                "   ___                                      .-~. /_\"-._\n" +
                "  `-._~-.                                  / /_ \"~o\\  :Y\n" +
                "      \\  \\                                / : \\~x.  ` ')\n" +
                "       ]  Y                              /  |  Y< ~-.__j\n" +
                "      /   !                        _.--~T : l  l<  /.-~\n" +
                "     /   /                 ____.--~ .   ` l /~\\ \\<|Y\n" +
                "    /   /             .-~~\"        /| .    ',-~\\ \\L|\n" +
                "   /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'\n" +
                "  /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .\n" +
                " Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_\n" +
                " |     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~\n" +
                " |      ~---~           /   ~~\"---\\_  ' __[>\n" +
                " l  .                _.^   ___     _>-y~\n" +
                "  \\  \\     .      .-~   .-~   ~>--\"  /\n" +
                "   \\  ~---\"            /     ./  _.-'\n" +
                "    \"-.,_____.,_  _.--~\\     _.-~\n" +
                "                ~~     (   _}\n" +
                "                        `. ~(\n" +
                "                          )  \\\n" +
                "                         /,`--'~\\--'";
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the monster! Prepare to fight.");
        System.out.println(monster);

        String health = "\n HEALTH: ============================================="

        Runner.gameOff();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Type your attack move");
        String input = in2.nextLine();
        while(!input.equals("I give up")){

            System.out.println("Type your attack move");
            if(input.equals("punch")){
                health = health.substring(0, health.length()-4);
            }
            else if(input.equals("kick")){
                health = health.substring(0, health.substring(0, health.length()-4));
            }
            else{
                System.out.println("That isn't a move...");
            }
            System.out.println(monster);
            System.out.println(health);
            System.out.println("Type your attack move");
            input = in2.nextLine();
        }


    }
}
