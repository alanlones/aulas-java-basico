package br.com.lonesapps.aulaweb.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lonesapps.aulaweb.model.Time;

@Component
public class Times {

	public List<Time> buscarTodos(){
		List<Time> times = new ArrayList<>();
		times.add(new Time(1, "Flamengo", 50));
		times.add(new Time(2, "Vasco", 46));
		return times;
	}
}
