package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object specialCommitments extends PropertyDef(
        iri = "http://schema.org/specialCommitments",
        iris = Set("http://schema.org/specialCommitments"),
        label = "specialCommitments",
        comment = """Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}