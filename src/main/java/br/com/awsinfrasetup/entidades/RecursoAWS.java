package br.com.awsinfrasetup.entidades;

import br.com.awsinfrasetup.enumeration.TipoServicoAWS;

import javax.persistence.*;
import java.util.List;

@Entity
public class RecursoAWS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoServicoAWS tipoServicoAWS;

    @OneToMany
    private List<Funcionalidade> funcionalidades;

}
