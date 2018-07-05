package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Veiculo {

    private String  divisao;
    private String  vincode;
    private String  chassi1;
    private int     chassi2;
    private String  modelo;
    private String  ano_modelo;
    private String  stat_veic;
    private Boolean stat_distr;
    private int     codfornec;
    private int     codtransp;
    private Boolean veic_export;
    private Boolean veic_goshi;
    private Date    data_distri;
    private Date    data_nf;
    private String  serienf;
    private int     num_nf;
    private String  bm_cod;
    private String  cor_ext;
    private String  cor_int;
    private String  cod_kata;
    private String  keyno;
    private String  prodyear;
    private String  prodmonth;
    private Date    dtYardIN;
    private Date    dtYardOut;
    private String  cod_urn;
    private int     codFinan;
    private Date    dtConfpgto;
    private int     numTabPreco;
    private int     codRegPreco;
    private String  local;
        
    
    
    /* Constructors */
    public VehicleData() {
       
    }
    
    public VehicleData(String pdivisao,
	    		    String pvincode,
	    		    String pchassi1,
	    		    int    pchassi2,
                            String  pmodelo,
                            String  pano_modelo,
                            String  pstat_veic,
                            Boolean pstat_distr,
                            int     pcodfornec,
                            int     pcodtransp,
                            Boolean pveic_export,
                            Boolean pveic_goshi,
                            Date    pdata_distri,
                            Date    pdata_nf,
                            String  pserienf,
                            int     pnum_nf,
                            String  pbm_cod,
                            String  pcor_ext,
                            String  pcor_int,
                            String  pcod_kata) {
				
	this.divisao    = pdivisao;
	this.vincode    = pvincode;
	this.chassi1    = pchassi1;
	this.chassi2    = pchassi2;
	this.modelo     = pmodelo;
	this.ano_modelo = pano_modelo;
	this.stat_veic  = pstat_veic;
	this.stat_distr = pstat_distr;
	this.codfornec  = pcodfornec;
    this.codtransp  = pcodtransp;
    this.veic_export = pveic_export;
	this.veic_goshi  = pveic_goshi;
	this.data_distri = pdata_distri;
	this.data_nf     = pdata_nf;
	this.serienf     = pserienf;
	this.num_nf      = pnum_nf;
	this.bm_cod      = pbm_cod;
	this.cor_ext     = pcor_ext;
	this.cor_int     = pcor_int;
	this.cod_kata    = pcod_kata;
	
    }
    
    
    public VehicleData(String pdivisao,
		    String pvincode,
		    String pchassi1,
		    int    pchassi2) {
	
	this.divisao    = pdivisao;
	this.vincode    = pvincode;
	this.chassi1    = pchassi1;
	this.chassi2    = pchassi2;
	
    }
    
    
    /* Métodos */
    
    public String getDivisao() {
        return divisao;
    }
    
    
    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }
    
    public String getVincode() {
        return vincode;
    }
    
    public void setVincode(String vincode) {
        this.vincode = vincode;
    }
    
    public String getChassi1() {
        return chassi1;
    }
    
    public void setChassi1(String chassi1) {
        this.chassi1 = chassi1;
    }
    
    public int getChassi2() {
        return chassi2;
    }
    
    public void setChassi2(int chassi2) {
        this.chassi2 = chassi2;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getAno_modelo() {
        return ano_modelo;
    }
    
    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }
    
    public String getStat_veic() {
        return stat_veic;
    }
    
    public void setStat_veic(String stat_veic) {
        this.stat_veic = stat_veic;
    }
    
    public Boolean getStat_distr() {
        return stat_distr;
    }
    
    public void setStat_distr(Boolean stat_distr) {
        this.stat_distr = stat_distr;
    }
    
    public int getCodfornec() {
        return codfornec;
    }
    
    public void setCodfornec(int codfornec) {
        this.codfornec = codfornec;
    }
    
    public int getCodtransp() {
        return codtransp;
    }
    
    public void setCodtransp(int codtransp) {
        this.codtransp = codtransp;
    }
    
    public Boolean getVeic_export() {
        return veic_export;
    }
    
    public void setVeic_export(Boolean veic_export) {
        this.veic_export = veic_export;
    }
    
    public Boolean getVeic_goshi() {
        return veic_goshi;
    }
    
    public void setVeic_goshi(Boolean veic_goshi) {
        this.veic_goshi = veic_goshi;
    }
    
    public Date getData_distri() {
        return data_distri;
    }
    
    public void setData_distri(Date data_distri) {
        this.data_distri = data_distri;
    }
    
    public Date getData_nf() {
        return data_nf;
    }
    
    public void setData_nf(Date data_nf) {
        this.data_nf = data_nf;
    }
    
    public String getSerienf() {
        return serienf;
    }
    
    public void setSerienf(String serienf) {
        this.serienf = serienf;
    }
    
    public int getNum_nf() {
        return num_nf;
    }
    
    public void setNum_nf(int num_nf) {
        this.num_nf = num_nf;
    }
    
    public String getBm_cod() {
        return bm_cod;
    }
    
    public void setBm_cod(String bm_cod) {
        this.bm_cod = bm_cod;
    }
    
    public String getCor_ext() {
        return cor_ext;
    }
    
    public void setCor_ext(String cor_ext) {
        this.cor_ext = cor_ext;
    }
    
    public String getCor_int() {
        return cor_int;
    }
    
    public void setCor_int(String cor_int) {
        this.cor_int = cor_int;
    }
    
    public String getCod_kata() {
        return cod_kata;
    }
    
    public void setCod_kata(String cod_kata) {
        this.cod_kata = cod_kata;
    }
     
    public String dtadisp (Date pdate) {
	 DateFormat dfbr = new SimpleDateFormat("dd/mm/yyyy");
	 String strdta = null;
	 if(pdate != null) {	 
	     strdta	= dfbr.format(pdate).toString(); 
	 } 
	 else { 
	     strdta = "  /  /    ";
	 } 
	 
	 return strdta ;
	 	
    }

    /**
     * @return the keyno
     */
    public String getKeyno() {
	return keyno;
    }

    /**
     * @param keyno the keyno to set
     */
    public void setKeyno(String keyno) {
	this.keyno = keyno;
    }

    /**
     * @return the prodyear
     */
    public String getProdyear() {
	return prodyear;
    }

    /**
     * @param prodyear the prodyear to set
     */
    public void setProdyear(String prodyear) {
	this.prodyear = prodyear;
    }

    /**
     * @return the prodmonth
     */
    public String getProdmonth() {
	return prodmonth;
    }

    /**
     * @param prodmonth the prodmonth to set
     */
    public void setProdmonth(String prodmonth) {
	this.prodmonth = prodmonth;
    }

    /**
     * @return the dtYardIN
     */
    public Date getDtYardIN() {
	return dtYardIN;
    }

    /**
     * @param dtYardIN the dtYardIN to set
     */
    public void setDtYardIN(Date dtYardIN) {
	this.dtYardIN = dtYardIN;
    }

    /**
     * @return the dtYardOut
     */
    public Date getDtYardOut() {
	return dtYardOut;
    }

    /**
     * @param dtYardOut the dtYardOut to set
     */
    public void setDtYardOut(Date dtYardOut) {
	this.dtYardOut = dtYardOut;
    }

    /**
     * @return the cod_urn
     */
    public String getCod_urn() {
	return cod_urn;
    }

    /**
     * @param cod_urn the cod_urn to set
     */
    public void setCod_urn(String cod_urn) {
	this.cod_urn = cod_urn;
    }

	public int getCodFinan() {
		return codFinan;
	}

	public void setCodFinan(int codFinan) {
		this.codFinan = codFinan;
	}

	public Date getDtConfpgto() {
		return dtConfpgto;
	}

	public void setDtConfpgto(Date dtConfpgto) {
		this.dtConfpgto = dtConfpgto;
	}

	public int getNumTabPreco() {
		return numTabPreco;
	}

	public void setNumTabPreco(int numTabPreco) {
		this.numTabPreco = numTabPreco;
	}

	public int getCodRegPreco() {
		return codRegPreco;
	}

	public void setCodRegPreco(int codRegPreco) {
		this.codRegPreco = codRegPreco;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
    
    
   
}
