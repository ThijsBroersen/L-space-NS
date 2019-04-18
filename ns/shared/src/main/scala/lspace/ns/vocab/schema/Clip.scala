package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Clip extends OntologyDef(
        iri = "http://schema.org/Clip",
        iris = Set("http://schema.org/Clip"),
        label = "Clip",
        comment = """A short TV or radio program or a segment/part of a program.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val clipNumber = lspace.ns.vocab.schema.clipNumber.property
lazy val startOffset = lspace.ns.vocab.schema.startOffset.property
lazy val actors = lspace.ns.vocab.schema.actors.property
}
override lazy val properties: List[LProperty] = List(clipNumber, startOffset, actors)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val clipNumber = lspace.ns.vocab.schema.clipNumber.property
lazy val startOffset = lspace.ns.vocab.schema.startOffset.property
lazy val actors = lspace.ns.vocab.schema.actors.property
}
}