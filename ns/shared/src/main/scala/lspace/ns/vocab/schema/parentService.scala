package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object parentService
    extends PropertyDef(
      iri = "http://schema.org/parentService",
      iris = Set("http://schema.org/parentService"),
      label = "parentService",
      comment =
        """A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.""",
      `@extends` = () => List(),
      `@range` = () => List(BroadcastService.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
