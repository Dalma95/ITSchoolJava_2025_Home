package session34;

class SistemLumini{
    public void stingeLumina(){
        System.out.println("Luminile s-au stins.");
    }
}
class SistemAudio{
    public void pronesteSistemulAudio(){
        System.out.println("Sistemul audio este pornit");
    }
}
class SistemVideo{
    public void pornesteSistemVideo(){
        System.out.println("Videoproiector pornit");
    }
}
class SistemDraperii{
    public void trageDraperiile(){
        System.out.println("Draperii trase");
    }
}
class HomeCinemaFacade{
    public SistemAudio sistemAudio;
    public SistemLumini sistemLumini;
    public SistemVideo sistemVideo;
    public SistemDraperii sistemDraperii;

    public HomeCinemaFacade() {
        this.sistemAudio = new SistemAudio();
        this.sistemVideo = new SistemVideo();
        this.sistemLumini = new SistemLumini();
        this.sistemDraperii = new SistemDraperii();
    }

    public void pornesteFilm(){
        sistemLumini.stingeLumina();
        sistemAudio.pronesteSistemulAudio();
        sistemDraperii.trageDraperiile();
        sistemVideo.pornesteSistemVideo();
    }
    }



public class Facade {
    public static void main(String[] args) {
        HomeCinemaFacade homeCinema = new HomeCinemaFacade();
        homeCinema.pornesteFilm();
    }
}
