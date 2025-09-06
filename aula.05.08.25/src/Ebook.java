public class Ebook extends Livro{
    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
    @Override
    public void mostrarDetalhes(){
        String mensagem = "Detalhes do Ebook";
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println(" ISBN: " + this.getIsbn());

        if (temAutor()){
            this.getAutor().mostrarDetalhesAutor();
        }

        System.out.println("---");
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if (porcentagem > 15){
            System.out.println("Não é possível dar desconto maior que 15%");
            return false;
        }

        return super.aplicarDescontoDe(porcentagem);
    }
}
