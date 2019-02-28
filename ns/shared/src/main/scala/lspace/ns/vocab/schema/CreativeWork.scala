package lspace.ns.vocab.schema

import lspace.structure.{OntologyDef, Property}
import lspace.{ns, NS}

object CreativeWork
    extends OntologyDef(
      NS.vocab.schema + "CreativeWork",
      label = "CreativeWork",
      comment = "The most generic kind of creative work, including books, movies, photographs, software programs, etc.",
      `@extends` = () => Thing.ontology :: Nil
    ) {
  object keys extends Thing.Properties {
    lazy val dateCreated  = ns.vocab.schema.dateCreated
    lazy val dateModified = ns.vocab.schema.dateModified
  }
  override lazy val properties
    : List[Property] = keys.dateCreated.property :: keys.dateModified.property :: Thing.properties
  trait Properties extends Thing.Properties {
    val dateCreated  = keys.dateCreated
    val dateModified = keys.dateModified
  }
}
