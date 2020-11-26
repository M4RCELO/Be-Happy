package menu.escola;

public class MenuInterator implements Interator{
	
	ItemMenu[] itens;
	int posicao = 0;

	public MenuInterator(ItemMenu[] itens) {
		this.itens = itens;
	}

	@Override
	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		ItemMenu menuItem = itens[posicao];
		posicao++;
		return menuItem;
	}
	
	public Integer getPosicao() {
		return posicao;
	}

}
