package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class pedido implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PEDIDO_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "PEDIDO_ID_GENERATOR", sequenceName = "PEDIDO_ID_SEQ")
   private java.lang.Long id;

   private int filial_operac;

   private java.util.Date dt_criacao;

   private java.lang.String descricao;

   public pedido()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public int getFilial_operac()
   {
      return this.filial_operac;
   }

   public void setFilial_operac(int filial_operac)
   {
      this.filial_operac = filial_operac;
   }

   public java.util.Date getDt_criacao()
   {
      return this.dt_criacao;
   }

   public void setDt_criacao(java.util.Date dt_criacao)
   {
      this.dt_criacao = dt_criacao;
   }

   public java.lang.String getDescricao()
   {
      return this.descricao;
   }

   public void setDescricao(java.lang.String descricao)
   {
      this.descricao = descricao;
   }

   public pedido(java.lang.Long id, int filial_operac,
         java.util.Date dt_criacao, java.lang.String descricao)
   {
      this.id = id;
      this.filial_operac = filial_operac;
      this.dt_criacao = dt_criacao;
      this.descricao = descricao;
   }

}