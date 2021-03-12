package dao;

import org.springframework.stereotype.Component;

@Component("d_comp")
public class DaoImpl implements IDAO{
	@Override
	public double getValue() {
		double value=76.8;
		return value;
	}
}
