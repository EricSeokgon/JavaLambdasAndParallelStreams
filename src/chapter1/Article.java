package chapter1;

public class Article {
    private final int _articleNo;
    private String _name;
    private Money _price;
    private int _maxSell;
    private int _probability;

    public Article(String articleData, int articleNo) {
        _articleNo = articleNo;
        try {
            String[] parts = articleData.split(";");
            _name = parts[0];
            _price = new Money(parts[1]);
            _maxSell = Integer.parseInt(parts[2]);
            _probability = Integer.parseInt(parts[3]);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public int get_articleNo() {
        return _articleNo;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Money get_price() {
        return _price;
    }

    public void set_price(Money _price) {
        this._price = _price;
    }

    public int get_maxSell() {
        return _maxSell;
    }

    public void set_maxSell(int _maxSell) {
        this._maxSell = _maxSell;
    }

    public int get_probability() {
        return _probability;
    }

    public void set_probability(int _probability) {
        this._probability = _probability;
    }
}
