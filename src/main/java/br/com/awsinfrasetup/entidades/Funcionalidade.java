package br.com.awsinfrasetup.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_funcionalidade")
public class Funcionalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column
    private String comandoAwsCli;

    @Column
    private String codigoJavaSdk;

    @ManyToOne
    private RecursoAWS recursoAWS;

}
