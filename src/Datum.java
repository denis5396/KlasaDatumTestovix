public class Datum implements Comparable<Datum>{
    private int dan, mjesec, godina;
    private boolean jesuLiDatumiJednaki(Datum d1, Datum d2){
        if(this.dan == d2.dan && this.mjesec == d2.mjesec && this.godina == d2.godina){
            return true;
        }
        else {
            return false;
        }

    }

    private Datum(){
        //ovdje nista ne upisivati,
        //konstruktor bez parametara je oznacen kao private
        // i služi da zabrani kreiranje "prazog" datuma naredbom :
        // Datum d = new Datum();
        // Za kreiranje objekata ce se samo koristiti konstruktor sa 3 parametra
        // koji se nalazi ispod!
    }

    public Datum(int dan, int mjesec, int godina) throws Exception   {
        if(godina <= 2019 && godina >= 1919) {
            this.godina = godina;
            if (mjesec >= 1 && mjesec <= 12) {
                if (mjesec == 1) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 2) {
                    if(godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0){
                        if(dan > 29 || dan < 1){
                            throw new Exception();
                        }
                        if (dan <= 29 && dan >= 1) {
                            this.dan = dan;
                            this.mjesec = mjesec;

                        }
                    }
                    else if(dan > 28 || dan < 1){
                        throw new Exception();
                    }
                    else if (dan <= 28 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }

                }
                if (mjesec == 3) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 4) {
                    if(dan > 30 || dan < 1){
                        throw new Exception();
                    }
                    if (dan <= 30 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 5) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 6) {
                    if(dan > 30 || dan < 1){
                        throw new Exception();
                    }
                    if (dan <= 30 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 7) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 8) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 9) {
                    if(dan > 30 || dan < 1){
                        throw new Exception();
                    }
                    if (dan <= 30 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 10) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 11) {
                    if(dan > 30 || dan < 1){
                        throw new Exception();
                    }
                    if (dan <= 30 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }
                if (mjesec == 12) {
                    if (dan <= 31 && dan >= 1) {
                        this.dan = dan;
                        this.mjesec = mjesec;
                    }
                }

            }
        }
        if(dan > 31 || dan < 1){
            throw new Exception();
        }
        if(godina > 2019 || godina < 1919){
            throw new Exception();
        }
        if(mjesec > 12 || mjesec < 1){
            throw new Exception();
        }

        System.out.print(this.dan + " , " + this.mjesec + " , " + this.godina);
    }

    public void pomjeriZaJedanDanUnaprijed(){

        if(mjesec == 1) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 2;
            }
            else
                this.dan = dan +1;

        }
        else if(mjesec == 2) {
            if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
                if (dan == 29) {
                    this.dan = 1;
                    this.mjesec = 3;
                } else {
                    this.dan = dan + 1;
                }
            }
            else {
                if (dan == 28) {
                    this.dan = 1;
                    this.mjesec = 3;
                } else
                    this.dan = dan + 1;

            }
        }
        else if(mjesec == 3) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 4;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 4) {
            if (dan == 30) {
                this.dan = 1;
                this.mjesec = 5;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 5) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 6;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 6) {
            if (dan == 30) {
                this.dan = 1;
                this.mjesec = 7;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 7) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 8;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 8) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 9;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 9) {
            if (dan == 30) {
                this.dan = 1;
                this.mjesec = 10;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 10) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 11;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 11) {
            if (dan == 30) {
                this.dan = 0;
                this.mjesec = 12;
            }
            else
                this.dan = dan + 1;
        }
        else if(mjesec == 12) {
            if (dan == 31) {
                this.dan = 1;
                this.mjesec = 1;
                this.godina = godina +1;
            }
            else
                this.dan = dan + 1;
        }

        System.out.println("");
        System.out.print(this.dan + " , " + this.mjesec + " , " + this.godina);
    }
    public void pomjeriZaJedanDanUnazad(){

            if(mjesec == 1) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 12;
                    this.godina = godina -1;
                }
                else
                    this.dan = dan - 1;

            }
            else if(mjesec == 2) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 1;
                    this.godina = godina -1;
                }
                else
                    this.dan = dan - 1;

            }
            else if(mjesec == 3) {
                if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
                    if (dan == 1) {
                        this.dan = 29;
                        this.mjesec = 2;
                    } else {
                        this.dan = dan - 1;
                    }
                } else {
                    if (dan == 1) {
                        this.dan = 28;
                        this.mjesec = 2;
                    } else
                        this.dan = dan - 1;

                }
            }
            else if(mjesec == 4) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 3;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 5) {
                if (dan == 1) {
                    this.dan = 30;
                    this.mjesec = 4;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 6) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 5;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 7) {
                if (dan == 1) {
                    this.dan = 30;
                    this.mjesec = 6;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 8) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 7;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 9) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 8;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 10) {
                if (dan == 1) {
                    this.dan = 30;
                    this.mjesec = 9;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 11) {
                if (dan == 1) {
                    this.dan = 31;
                    this.mjesec = 10;
                }
                else
                    this.dan = dan - 1;
            }
            else if(mjesec == 12) {
                if (dan == 1) {
                    this.dan = 30;
                    this.mjesec = 11;
                }
                else
                    this.dan = dan - 1;
            }

            System.out.println("");
            System.out.print(this.dan + " , " + this.mjesec + " , " + this.godina);
        }



    @Override
    public String toString(){
        String rezultat;
        rezultat ="¸¸" + dan + "/" + mjesec + "/" + godina + "˘˘";
        return rezultat; //ovo izbrisati pa svoje ubaciti
    }

    @Override
    public boolean equals(Object o){
        //ovu funkciju ne prepravljati!
        if(o == null) return false;
        else{
            Datum d = (Datum) o;
            return jesuLiDatumiJednaki(this, d);
        }
    }

    @Override
    public int compareTo(Datum d){

        if(jesuLiDatumiJednaki(this,d)) return 0;
        if(this.godina < d.godina){
            return -1;
        }
        else if (this.godina == d.godina && this.mjesec < d.mjesec){
            return -1;
        }
        else if(this.godina == d.godina && this.mjesec == d.mjesec &&  this.dan < d.dan){
            return -1;
        }



        return 1; //ovo izbrisati pa svoje ubaciti
    }
}