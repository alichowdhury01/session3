
public class IndexNoeud implements Comparable<IndexNoeud> {


	private int num, taille;//,nbLivres
	private long adr;
    String fabriquant, modele, option;
    private boolean deleted;
	float prix;
	public IndexNoeud() {}

	public IndexNoeud(int num, long adr, String fabriquant, int taille, boolean deleted ) {
		setNum(num);
		setAdr(adr);
        setFabriquant(fabriquant);
        setModele(modele);
        setOption(option);
        setPrix(prix);
		settaille(taille);
		setDeleted(deleted);
	}

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getFabriquant() {
        return fabriquant;
    }
	
	public void setFabriquant(String fabriquant) {
        this.fabriquant = fabriquant;
	}

    public int getAdr() {
        return (int) adr;
    }

	public void setAdr(long adr) {
		this.adr = adr;
	}

	public int gettaille() {
		return taille;
	}

	public void settaille(int taille) {
		this.taille = taille;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int compareTo(IndexNoeud o) {
		if(this.getNum() > o.getNum()) {
			return 1;
			}else if(this.getNum() == o.getNum()) {
				return 0;	
			}else {
				return -1;
			}
		}
	
	@Override
	public String toString() {
		return "[num=" + num + ", taille=" + taille + ", adr=" + adr + ", deleted=" + deleted + "]\n";
	}

    public void setOption(String newOption) {
        this.option = newOption;

    }

    public void setPrix(float prix) {
        this.prix = (int) prix;
    }
}
