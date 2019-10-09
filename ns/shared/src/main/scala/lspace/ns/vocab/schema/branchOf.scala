package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object branchOf extends PropertyDef(
        iri = "http://schema.org/branchOf",
        iris = Set("http://schema.org/branchOf"),
        label = "branchOf",
        comment = """The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical)<a class="localLink" href="http://schema.org/branch">branch</a>.""",
        `@extends` = List(),
        `@range` = List(Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}