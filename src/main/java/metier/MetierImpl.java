package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("m_comp")
public class MetierImpl implements IMetier{
	@Autowired
	private IDAO dao;
	@Override
	public double calcul() {
		return dao.getValue();
	}
	public void setDao(IDAO dao) {
		this.dao=dao;
	}
}
