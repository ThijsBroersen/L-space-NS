package lspace.ns.vocab.schema

import lspace.structure.{OntologyDef, Property}
import lspace.{ns, NS}

object Person
    extends OntologyDef(NS.vocab.schema + "Person",
                        label = "Person",
                        comment = "A person (alive, dead, undead, or fictional).",
                        `@extends` = () => Thing.ontology :: Nil) {

  object keys extends Thing.Properties {
    lazy val honorificPrefix = ns.vocab.schema.honorificPrefix
    lazy val honorificSuffix = ns.vocab.schema.honorificSuffix
  }
  override lazy val properties
    : List[Property] = keys.honorificPrefix.property :: keys.honorificSuffix.property :: Thing.properties
  trait Properties extends Thing.Properties {
    lazy val honorificPrefix = keys.honorificPrefix
    lazy val honorificSuffix = keys.honorificSuffix
  }

}
