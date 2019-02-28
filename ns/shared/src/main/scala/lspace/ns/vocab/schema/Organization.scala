package lspace.ns.vocab.schema

import lspace.structure.{OntologyDef, Property}
import lspace.{ns, NS}

object Organization
    extends OntologyDef(
      NS.vocab.schema + "Organization",
      label = "Organization",
      comment = "An organization such as a school, NGO, corporation, club, etc.",
      `@extends` = () => Thing.ontology :: Nil
    ) {
  object keys extends Thing.Properties
  override lazy val properties: List[Property] = Thing.properties
  trait Properties extends Thing.Properties
}
