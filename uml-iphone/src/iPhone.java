public class iPhone implements Music, Phone, Browser {

    private Music musicPlayer;
    private Phone phone;
    private Browser browser;

    public iPhone(Music musicPlayer, Phone phone, Browser browser) {
        this.musicPlayer = musicPlayer;
        this.phone = phone;
        this.browser = browser;
    }

    // Métodos relacionados ao comportamento de um reprodutor musical
    @Override
    public void play() {
        musicPlayer.play();
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void select() {
        musicPlayer.select();
    }

    // Métodos relacionados ao comportamento de um aparelho telefônico
    @Override
    public void call() {
        phone.call();
    }

    @Override
    public void answer() {
        phone.answer();
    }

    @Override
    public void startVoicemail() {
        phone.startVoicemail();
    }

    // Métodos relacionados ao comportamento de um navegador na internet
    @Override
    public void display() {
        browser.display();
    }

    @Override
    public void addTab() {
        browser.addTab();
    }

    @Override
    public void refresh() {
        browser.refresh();
    }

    // Métodos adicionais específicos do iPhone
    public void playMusic() {
        play();
    }

    public void pauseMusic() {
        pause();
    }

    public void selectMusic() {
        select();
    }

    public void makeCall() {
        call();
    }

    public void answerCall() {
        answer();
    }

    public void startVoiceMail() {
        startVoicemail();
    }

    public void displayPage() {
        display();
    }

    public void addNewTab() {
        addTab();
    }

    public void refreshPage() {
        refresh();
    }
}
