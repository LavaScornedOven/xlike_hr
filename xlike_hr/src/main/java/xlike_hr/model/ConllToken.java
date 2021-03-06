package xlike_hr.model;

public class ConllToken {
	private static final String NULL = "_";
	private int id;
	private String word;// : the word 
	private String lemma;// : the lemma
	private String pos;// : a pos tag 
	private String msd;// : a list of attribute-value pairs separated by "|", or "_" for empty lists
	private String ne;// : named entities in BIO format (see CoNLL-2002)
	private String head = NULL;
	private String dlabel = NULL;
	private String pred = NULL;
	private String prole = NULL;
	private String a1 = NULL;//TIN
	private String a2 = NULL;//TIN
	private int start = -1;
	private int end = -1;
	private boolean POStagged = false;
	private boolean NEtagged = false;
	
	public ConllToken(int id, String word){ //for tokenize option
		this.id = id;
		this.word = word;
		this.lemma = NULL;
		this.pos = NULL;
		this.msd = NULL;
		this.ne = NULL;
	}
	
	public ConllToken(int id, String word, String lemma, String pos, String msd, String ne){
		this.id = id;
		if(word == null)
			this.word=NULL;
		else
			this.word = word;
		if(lemma == null)
			this.lemma = NULL;
		else
			this.lemma = lemma;
		if(pos == null)
			this.pos = NULL;
		else
			this.pos = pos;
		if(msd == null)
			this.msd = NULL;
		else
			this.msd = msd;
		if(ne == null)
			this.ne = NULL;
		else
			this.ne = ne;
	}
	public ConllToken(int id, String word, String lemma, String pos, String msd, String ne, String head, String dlabel, String pred, String prole, String a1, String a2){
		this(id, word, lemma,pos, msd, ne);//TIN
		if(head == null)
			this.head = NULL;
		else
			this.head = head;
		
		if(dlabel == null)
			this.dlabel = NULL;
		else
			this.dlabel = dlabel;
		
		if(pred == null)
			this.pred = NULL;
		else
			this.pred = pred;
		
		if(prole == null)
			this.prole = NULL;
		else
			this.prole = prole;
		
		if(a1 == null)
			this.a1 = NULL;
		else
			this.a1 = a1;
		
		if(a2 == null)
			this.a2 = NULL;
		else
			this.a2 = a2;
			
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		if(word == null)
			this.word = NULL;
		else
			this.word = word;
	}
	public String getLemma() {
		return lemma;
	}
	public void setLemma(String lemma) {
		if(lemma == null)
			this.lemma = NULL;
		else
			this.lemma = lemma;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		if(pos == null)
			this.pos = NULL;
		else
			this.pos = pos;
	}
	public String getMsd() {
		return msd;
	}
	public void setMsd(String msd) {
		if(this.msd == null)
			this.msd = NULL;
		else
			this.msd = msd;
	}
	public String getNe() {
		return ne;
	}
	public void setNe(String ne) {
		if(this.ne == null)
			this.ne = NULL;
		else
			this.ne = ne;
	}

	public String getHead() {
		return head;
	}

	public String getDlabel() {
		return dlabel;
	}

	public String getPred() {
		return pred;
	}

	public String getProle() {
		return prole;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	public void setHead(String head) {
		this.head = head;
	}

	public void setDlabel(String dlabel) {
		this.dlabel = dlabel;
	}
	
	public void setA1 (String a1){
		this.a1 = a1;
	}
	
	public void setA2 (String a2){
		this.a2 = a2;
	}
	
	public String getA1(){//TIN
		return a1;
	}
	
	public String getA2(){//TIN
		return a2;
	}
	
	public void setPOStagged (boolean flag)
	{
		POStagged = flag;
	}
	public void setNEtagged (boolean flag)
	{
		NEtagged = flag;
	}
	public boolean getPOStagged()
	{
		return POStagged;
	}
	public boolean getNEtagged()
	{
		return NEtagged;
	}
}
