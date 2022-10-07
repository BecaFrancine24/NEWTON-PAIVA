package questao1;

public class Pagamento {
    private String dataHoraPagamento;
    private String numeroPagamento;
    private String valorPago;

    public Pagamento(String dataHoraPagamento,String numeroPagamento,String valorPago){
        super();
        this.dataHoraPagamento=dataHoraPagamento;
        this.numeroPagamento=numeroPagamento;
        this.valorPago=valorPago;
    }

    public String getdataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setdataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public String getnumeroPagamento() {
        return numeroPagamento;
    }

    public void setnumeroPagamento(String numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public String getvalorPago() {
        return valorPago;
    }

    public void setvalorPago(String valorPago) {
        this.valorPago = valorPago;
    }


    public void Pagamento(String dataHoraPagamento, String numeroPagamento, String valorPago){
    }

    public String imprimePagamento() {

        return null;
    }


}