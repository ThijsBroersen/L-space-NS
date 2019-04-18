package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object comprisedOf extends PropertyDef(
        iri = "http://schema.org/comprisedOf",
        iris = Set("http://schema.org/comprisedOf"),
        label = "comprisedOf",
        comment = """Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.""",
        `@extends` = () => List(),
        `@range` = () => List(AnatomicalStructure.ontology, AnatomicalSystem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}