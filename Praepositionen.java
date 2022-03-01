import java.util.*;
import java.util.Random;

public class Praepositionen {

    public static int[] random(int length) {

        int[] randomArr = new int[length];

        Random rand = new Random();
        boolean[] check = new boolean[length];

        for (int k = 0; k < length; k++) {
            int rnd = rand.nextInt(length);
            //check if the check array index has been set
            //if set regenerate
            while (check[rnd]) {
                rnd = rand.nextInt(length);
            }
            randomArr[k] = rnd;
            check[rnd] = true;
        }
        return randomArr;
    }


    public static void main(String[] args) {
        System.out.println("What's your name? ");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Hello " + name + "! Welcome to the preposition trainer. This program consists out of 4 different stages: ");
        System.out.println("   1. What is the corresponding preposition?");
        System.out.println("   2. What case is used?");
        System.out.println("   3. What is the german translation?");
        System.out.println("   4. What is the english translation?");
        System.out.println("Each section will consist out of 28 words. You can type 'exit' at any time to stop the program.");
        System.out.println("Would you like to start your exercise? (yes / no)");

        String answer = in.nextLine();

        if(answer.equals("yes") || answer.equals("Yes")) {
            excersise();
        } else {
            System.out.println("See you later!");
        }

    }

    public static void excersise() {
        String[][] praep = wort();
        int[] randNr = random(praep.length);
        Scanner in = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < praep.length; i++) {
            if (i < 28) {
                System.out.println("What is the preposition of " + praep[randNr[i]][0] + " +" + praep[randNr[i]][2] + "?");
                String answer = in.nextLine();

                if (answer.equals(praep[randNr[i]][1])) {
                    System.out.println("Correct!"); count++;
                } else if (answer.equals("exit")) {
                    break;
                } else {
                    System.out.println("False. Correct answer is: " + praep[randNr[i]][1]);
                }
            } else if (i > 27 && i < 56) {
                if(i == 28) {
                    System.out.println("\n---You completed the first segment! You answered " + count + " out of 28 correctly.--- \n"); count = 0;
                }
                System.out.println("\nWhat case does " + praep[randNr[i]][0] + " " + praep[randNr[i]][1] + " use?");
                String answer = in.nextLine();

                if (answer.equals(praep[randNr[i]][2])) {
                    System.out.println("Correct!"); count++;
                } else if (answer.equals("exit")) {
                    break;
                } else {
                    System.out.println("False. Correct answer is: " + praep[i][2]);
                }
            } else if (i > 55 && i < 84) {
                if(i == 56) {
                    System.out.println("\n---You completed the first segment! You answered " + count + " out of 28 correctly.--- \n"); count = 0;
                    System.out.println("You will not receive marks or similar from here on. You can type in anything and the correct answer will be shown afterwards");
                }
                System.out.println("\nWhat is the german translation for '" + praep[randNr[i]][3] + "'?");
                String answer = in.nextLine();
                if(answer.equals("exit")) break;

                System.out.println("Great answer! I thought about: '" + praep[randNr[i]][0] + " " + praep[randNr[i]][1] + "'\n");

            } else if(i > 83) {
                System.out.println("\nWhat is the english translation for '" + praep[randNr[i]][0] + " " + praep[randNr[i]][1] + "'?");
                String answer = in.nextLine();
                if(answer.equals("exit")) break;

                System.out.println("Great answer! I thought about: '" + praep[randNr[i]][3] + "'\n");
            }
        }
        System.out.println("\nThank you for learning! Goodbye!");
    }


    public static String[][] wort() {
        String[][] praep = {
                {"abhaengen"             , "von"         ,"D"        ,"to depend on"                                   },
                {"achten"                , "auf"         ,"A"        ,"to watch out for"                               },
                {"anfangen"              , "mit"         ,"D"        ,"to begin to do"                                 },
                {"ankommen"              , "auf"         ,"A"        ,"to come down to"                                },
                {"antworten"             , "auf"         ,"A"        ,"to reply to"                                    },
                {"sich aergern"          , "ueber"       ,"A"        ,"to be angry about sth"                          },
                {"aufhoeren"             , "mit"         ,"D"        ,"to stop"                                        },
                {"aufpassen"             , "auf"         ,"A"        ,"to watch out for"                               },
                {"sich aufregen"         , "ueber"       ,"A"        ,"to get worked up over"                          },
                {"ausgeben"              , "fuer"        ,"A"        ,"to impersonate sb or to spend money on"         },
                {"sich bedanken"         , "bei"         ,"D"        ,"to thank someone"                               },
                {"sich bedanken"         , "fuer"        ,"A"        ,"to thank for"                                   },
                {"beginnen"              , "mit"         ,"D"        ,"to start with"                                  },
                {"sich bemuehen"         , "um"          ,"A"        ,"to care about or to strive after"               },
                {"berichten"             , "ueber"       ,"A"        ,"to cover sth"                                   },
                {"sich beschaeftigen"    , "mit"         ,"D"        ,"to address sth or to tinker with"               },
                {"sich beschweren"       , "bei"         ,"D"        ,"to complain to sb"                              },
                {"bestehen"              , "aus"         ,"D"        ,"to consist out of sth"                          },
                {"bestehen"              , "auf"         ,"D"        ,"to be resiliant on"                             },
                {"sich beteiligen"       , "an"          ,"D"        ,"to take part in"                                },
                {"sich bewerben"         , "bei"         ,"D"        ,"to apply at"                                    },
                {"sich bewerben"         , "um"          ,"A"        ,"to apply for"                                   },
                {"sich beziehen"         , "auf"         ,"A"        ,"to refer to"                                    },
                {"bitten"                , "um"          ,"A"        ,"to ask for sth"                                 },
                {"danken"                , "fuer"        ,"A"        ,"to be thankful for"                             },
                {"denken"                , "an"          ,"A"        ,"to think about"                                 },
                {"diskutieren"           , "ueber"       ,"A"        ,"to discuss about"                               },
                {"einladen"              , "zu"          ,"D"        ,"to invite to"                                   },
                {"sich entscheiden"      , "fuer"        ,"A"        ,"to decide upon sth"                             },
                {"sich entschliessen"    , "zu"          ,"D"        ,"to decide on sth"                               },
                {"sich entschuldigen"    , "bei"         ,"D"        ,"to apologise to"                                },
                {"sich entschuldigen"    , "fuer"        ,"A"        ,"to apologise for"                               },
                {"erfahren"              , "von"         ,"D"        ,"to learn of or to hear of"                      },
                {"sich erholen"          , "von"         ,"D"        ,"to recover from"                                },
                {"sich erinnern"         , "an"          ,"A"        ,"to remember"                                    },
                {"erkennen"              , "an"          ,"D"        ,"to recognise sth or so because of sth"          },
                {"sich erkundigen"       , "nach"        ,"D"        ,"to ask after sb"                                },
                {"erschrecken"           , "ueber"       ,"A"        ,"to get scared by"                               },
                {"erzaehlen"             , "ueber"       ,"A"        ,"to relate or to narrate about"                  },
                {"erzaehlen"             , "von"         ,"D"        ,"to relate or to narrate about"                  },
                {"fragen"                , "nach"        ,"D"        ,"to ask about"                                   },
                {"sich freuen"           , "auf"         ,"A"        ,"to look forward to"                             },
                {"sich freuen"           , "ueber"       ,"A"        ,"to be excited about sth"                        },
                {"gehen"                 , "um"          ,"A"        ,"to be about sth"                                },
                {"gehoeren"              , "zu"          ,"D"        ,"to belong to"                                   },
                {"sich gewoehnen"        , "an"          ,"A"        ,"to acclimate oneself to sth"                    },
                {"glauben"               , "an"          ,"A"        ,"to believe in sth"                              },
                {"gratulieren"           , "zu"          ,"D"        ,"to congratulate to"                             },
                {"halten"                , "fuer"        ,"A"        ,"to deem sth is sth"                             },
                {"halten"                , "von"         ,"D"        ,"to think highly or poorly about sb"             },
                {"sich handeln"          , "um"          ,"A"        ,"to be sth or to deal with sth"                  },
                {"handeln"               , "von"         ,"D"        ,"to be about sb or sth"                          },
                {"helfen"                , "bei"         ,"D"        ,"to help with"                                   },
                {"hindern"               , "an"          ,"D"        ,"to hindern sb from doing sth"                   },
                {"hoffen"                , "auf"         ,"A"        ,"to hope for"                                    },
                {"hoeren"                , "von"         ,"D"        ,"to hear about"                                  },
                {"sich informieren"      , "ueber"       ,"A"        ,"to inform oneself about"                        },
                {"sich interessieren"    , "fuer"        ,"A"        ,"to be interested in"                            },
                {"klagen"                , "ueber"       ,"A"        ,"to complain about"                              },
                {"kaempfen"              , "fuer"        ,"A"        ,"to fight for"                                   },
                {"kommen"                , "zu"          ,"D"        ,"to go to sth"                                   },
                {"sich konzentrieren"    , "auf"         ,"A"        ,"to concentrate on"                              },
                {"sich kuemmern"         , "um"          ,"A"        ,"to care about sb or sth"                        },
                {"lachen"                , "ueber"       ,"A"        ,"to laugh about"                                 },
                {"leiden"                , "an"          ,"D"        ,"to suffer from"                                 },
                {"leiden"                , "unter"       ,"D"        ,"to suffer because of sb or sth"                 },
                {"nachdenken"            , "ueber"       ,"A"        ,"to think about"                                 },
                {"protestieren"          , "gegen"       ,"A"        ,"to protest against"                             },
                {"rechnen"               , "mit"         ,"D"        ,"to figure on"                                   },
                {"reden"                 , "ueber"       ,"A"        ,"to talk about"                                  },
                {"reden"                 , "von"         ,"D"        ,"to talk about"                                  },
                {"riechen"               , "nach"        ,"D"        ,"to smell of"                                    },
                {"sagen"                 , "ueber"       ,"A"        ,"to say about"                                   },
                {"sagen"                 , "zu"          ,"D"        ,"to say about"                                   },
                {"schicken"              , "an"          ,"A"        ,"to send to sb"                                  },
                {"schicken"              , "zu"          ,"D"        ,"to send sb to sth"                              },
                {"schimpfen"             , "ueber"       ,"A"        ,"to cuss about"                                  },
                {"schmecken"             , "nach"        ,"D"        ,"to taste of"                                    },
                {"schreiben"             , "an"          ,"A"        ,"to write to"                                    },
                {"sich schuetzen"        , "vor"         ,"D"        ,"to shelter from"                                },
                {"sein"                  , "fuer"        ,"A"        ,"to be in favour of sth"                         },
                {"sein"                  , "gegen"       ,"A"        ,"to be against sth"                              },
                {"sorgen"                , "fuer"        ,"A"        ,"to care for sb or sth"                          },
                {"sprechen"              , "mit"         ,"D"        ,"to talk with sb or sth"                         },
                {"sprechen"              , "ueber"       ,"A"        ,"to talk about sb or sth"                        },
                {"sterben"               , "an"          ,"D"        ,"to die of sth"                                  },
                {"streiten"              , "mit"         ,"D"        ,"to argue with sb"                               },
                {"streiten"              , "ueber"       ,"A"        ,"to argue about sth"                             },
                {"teilnehmen"            , "an"          ,"D"        ,"to participate in"                              },
                {"telefonieren"          , "mit"         ,"D"        ,"to be on the phone with sb"                     },
                {"sich treffen"          , "mit"         ,"D"        ,"to meet with sb"                                },
                {"sich treffen"          , "zu"          ,"D"        ,"to meet for sth"                                },
                {"ueberreden"            , "zu"          ,"D"        ,"to talk sb into sth"                            },
                {"sich unterhalten"      , "mit"         ,"D"        ,"to talk with sb"                                },
                {"sich unterhalten"      , "ueber"       ,"A"        ,"to talk with sb about sth"                      },
                {"sich verabreden"       , "mit"         ,"D"        ,"to arrange to meet sb"                          },
                {"sich verabschieden"    , "von"         ,"D"        ,"to say goodbye to sb"                           },
                {"vergleichen"           , "mit"         ,"D"        ,"to compare sth with sth"                        },
                {"sich verlassen"        , "auf"         ,"A"        ,"to rely on"                                     },
                {"sich verlieben"        , "in"          ,"A"        ,"to fall in love with"                           },
                {"sich verstehen"        , "mit"         ,"D"        ,"to get along with"                              },
                {"verstehen"             , "von"         ,"D"        ,"to know sth about sth"                          },
                {"sich vorbereiten"      , "auf"         ,"A"        ,"to prepare for"                                 },
                {"warnen"                , "vor"         ,"D"        ,"to warn"                                        },
                {"warten"                , "auf"         ,"A"        ,"to wait for"                                    },
                {"sich wenden"           , "an"          ,"A"        ,"to turn to"                                     },
                {"werden"                , "zu"          ,"D"        ,"to become"                                      },
                {"wissen"                , "von"         ,"D"        ,"to know about"                                  },
                {"sich wundern"          , "ueber"       ,"A"        ,"to wonder about"                                },
                {"zuschauen"             , "bei"         ,"D"        ,"to watch sth"                                   },
                {"zusehen"               , "bei"         ,"D"        ,"to watch sth"                                   },
                {"zweifeln"              , "an"          ,"D"        ,"to doubt"                                       }
        };
        return praep;
    }


}
