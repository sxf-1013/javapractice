package music;


    public class Music {
        public static void tune(Instrument i){
            i.play(Note.MIDDLE_C);
        }

        public static void main(String args[]) {
            Instrument[] orchestar = {
                    new Instrument()
            };
            Wind flute = new Wind();
            tune(flute);  //向上转型|

            newInstrument ni = new newInstrument();
            ni.play(Note.B_FLAT);
        }

    }




